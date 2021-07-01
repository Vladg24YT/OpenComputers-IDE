/*
 * The MIT License
 *
 * Copyright 2021 Vladislav Gorskii.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.VladTheMountain.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;
import org.apache.commons.collections4.queue.CircularFifoQueue;

/**
 * <code>The character reader, also called the input reader, reads the source code
 * and provides characters/code-points to the lexer upon request.</code>
 *
 * @author VladTheMountain
 */
public class InputReader {

    private BufferedReader reader;

    private Queue<Character> ringBuffer;
    private final int bufferSize = 256;
    /**
     * Stores the index of the caret (not the index of the last character read
     * to buffer)
     */
    protected int currentPos;

    /**
     * Sets the file at <code>path</code> as the code source
     *
     * @param path the path to the file, which contains the source code
     * @throws java.io.FileNotFoundException if the specified file could not be
     * found
     */
    public InputReader(String path) throws FileNotFoundException {
        this(new File(path));
    }

    /**
     * Sets the <code>file</code> as the code source.
     *
     * @param file the file to get source code from
     * @throws java.io.FileNotFoundException if the specified file could not be
     * found
     */
    public InputReader(File file) throws FileNotFoundException {
        ringBuffer = new CircularFifoQueue<>(bufferSize);
        reader = new BufferedReader(new FileReader(file));
        currentPos = 0;
    }

    /**
     * Get the next character from the input. This is used to look ahead the
     * characters without consuming/removing them from the input stream. Calling
     * the {@code peek()} method more than once will return the same character.
     *
     * @return The next character from the input
     * @throws java.io.IOException if an I/O error occures
     * @see #peek(int)
     */
    char peek() throws IOException {
        //ringBuffer.add((char) reader.read());
        return ringBuffer.peek();
    }

    /**
     * Get the next k-th character from the input. This is used to look ahead
     * the characters without consuming/removing them from the input stream.
     * Calling the {@code peek()} method more than once will return the same
     * character.
     *
     * @param k the index of the character to get
     * @return The k-th character from the input
     * @throws java.io.IOException if an I/O error occures
     * @see #peek()
     */
    char peek(int k) throws IOException {
        if (k >= bufferSize) {
            /*
            Read up to the k-th character and add it to the buffer.
            Since already n characters are in the buffer, total k-n number of 
            characters will be read.
             */
            //Looping through [currentPos; k] and reading every value to the buffer
            for (int i = currentPos; i < k; i++) {
                ringBuffer.add((char) reader.read());
                currentPos++;
            }
        } else {
            return (char) ringBuffer.toArray()[k];
        }
        return 0;
    }

    /**
     * Get the next character from the input, and remove it from the input. This
     * means, calling the {@code consume()} method multiple times will return a
     * new character at each invocation.
     *
     * @return The next character from the input
     * @see #consume(int)
     * @throws java.io.IOException if an I/O error occures
     */
    char consume() throws IOException {
        ringBuffer.add((char) reader.read());
        currentPos++;
        return ringBuffer.peek();
    }

    /**
     * Get the next k-th token from the input, and remove it from the input.
     * This means, calling the {@code consume()} method multiple times will
     * return a new character at each invocation.
     *
     * @param k the index of the character to get
     * @return The k-th character from the input buffer
     * @see #consume()
     */
    char consume(int k) {
        currentPos++;
        return (char) ringBuffer.toArray()[k];
    }

    /**
     * Checks whether the reader has reached the end of the input.
     *
     * @return {@code true} if the file ended, {@code false} otherwise
     * @throws java.io.IOException if an I/O error occures
     */
    boolean isEOF() throws IOException {
        if (reader.read() == -1) {
            reader.close();
            return true;
        }
        return false;
    }
}