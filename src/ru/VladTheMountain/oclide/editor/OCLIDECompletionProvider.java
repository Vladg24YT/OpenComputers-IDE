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
package ru.VladTheMountain.oclide.editor;

import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.FunctionCompletion;
import org.fife.ui.autocomplete.LanguageAwareCompletionProvider;
import org.fife.ui.autocomplete.ParameterizedCompletion.Parameter;

/**
 *
 * @author VladTheMountain
 */
public class OCLIDECompletionProvider {

    public static CompletionProvider getProvider() {
        ResourceBundle autocompletion = ResourceBundle.getBundle("ru.VladTheMountain.oclide.resources.autocompletion.Autocompletion", Locale.getDefault());
        DefaultCompletionProvider defaultProvider = new DefaultCompletionProvider();
        defaultProvider.setAutoActivationRules(true, null);
        defaultProvider.setParameterizedCompletionParams('(', ", ", ')');

        //Lua default
        /* Do we really need those two global vars in autocompletion? */
        defaultProvider.addCompletion(new BasicCompletion(defaultProvider, "_G"));
        defaultProvider.addCompletion(new BasicCompletion(defaultProvider, "_VERSION"));

        createCompletion(defaultProvider, "assert", "Lua 5.2", autocompletion.getString("assert"), "v's arguments", new CustomParameter[][]{
            {new CustomParameter("object", "v", true, "Object to return")},
            {new CustomParameter("object", "v", false, "Object to return"), new CustomParameter("string", "message", true, "Message to print if 'v' is false")}
        });

        createCompletion(defaultProvider, "dofile", "Lua 5.2", autocompletion.getString("dofile"), "Chunk's return values", new CustomParameter[][]{
            {new CustomParameter("string", "filename", true, "File to execute")},
            {}
        });

        createCompletion(defaultProvider, "error", "Lua 5.2", autocompletion.getString("error"), "", new CustomParameter[][]{
            {new CustomParameter("string", "message", true, "Message to print")},
            {new CustomParameter("string", "message", false, "Message to print"), new CustomParameter("number", "level", true, "Way of getting the error position")}
        });

        createCompletion(defaultProvider, "getmetatable", "Lua 5.2", autocompletion.getString("getmetatable"), "Returns 'object's __metatable field", new CustomParameter[][]{
            {new CustomParameter("table", "object", true, "Table to return __metatable value of")}
        });

        createCompletion(defaultProvider, "ipairs", "Lua 5.2", autocompletion.getString("ipairs"), "Returns three values - an iterator function, the table t, and 0", new CustomParameter[][]{
            {new CustomParameter("table", "t", true, "Table to iterate through")}
        });

        createCompletion(defaultProvider, "load", "Lua 5.2", autocompletion.getString("load"), "Returns the compiled chunk as a function", new CustomParameter[][]{
            {new CustomParameter("chunk", "chunk", true, "Chunk to load")},
            {new CustomParameter("chunk", "chunk", false, "Chunk to load"), new CustomParameter("string", "chunkname", true, "The name of the chunk for error messages and debug information")},
            {new CustomParameter("chunk", "chunk", false, "Chunk to load"), new CustomParameter("string", "chunkname", false, "The name of the chunk for error messages and debug information"), new CustomParameter("string", "mode", true, "Controls whether the chunk can be text or binary")},
            {new CustomParameter("chunk", "chunk", false, "Chunk to load"), new CustomParameter("string", "chunkname", false, "The name of the chunk for error messages and debug information"), new CustomParameter("string", "mode", false, "Controls whether the chunk can be text or binary"), new CustomParameter("object", "env", true, "The value to set the first upvalue of the chunk to")}
        });

        createCompletion(defaultProvider, "loadfile", "Lua 5.2", autocompletion.getString("loadfile"), "The same as <code>load()</code>", new CustomParameter[][]{
            {new CustomParameter("string", "filename", true, "The file to get the chunk from")},
            {new CustomParameter("string", "filename", false, "The file to get the chunk from"), new CustomParameter("string", "mode", false, "Controls whether the chunk can be text or binary")},
            {new CustomParameter("string", "filename", false, "The file to get the chunk from"), new CustomParameter("string", "mode", false, "Controls whether the chunk can be text or binary"), new CustomParameter("object", "env", true, "The value to set the first upvalue of the chunk to")},
            {}
        });

        createCompletion(defaultProvider, "next", "Lua 5.2", autocompletion.getString("next"), "Returns the next index of the table and its associated value", new CustomParameter[][]{
            {new CustomParameter("table", "table", true, "The table to traverse all fields of")},
            {new CustomParameter("table", "table", false, "The table to traverse all fields of"), new CustomParameter("number", "index", true, "The initial index")}
        });

        createCompletion(defaultProvider, "pairs", "Lua 5.2", autocompletion.getString("pairs"), "Returns <code>next(t)</code>, <code>t</code> and <code>nil</code>", new CustomParameter[][]{
            {new CustomParameter("table", "t", true, "The table to iterate through")}
        });

        createCompletion(defaultProvider, "pcall", "Lua 5.2", autocompletion.getString("pcall"), "Returns the status code of calling <code>f(...)</code>", new CustomParameter[][]{
            {new CustomParameter("function", "f", true, "Function to call")},
            {new CustomParameter("function", "f", false, "Function to call"), new CustomParameter("", "...", true, "Function arguments")}
        });

        createCompletion(defaultProvider, "print", "Lua 5.2", autocompletion.getString("print"), "", new CustomParameter[][]{
            {new CustomParameter("", "...", true, "Object(-s) to print")}
        });

        createCompletion(defaultProvider, "rawequal", "Lua 5.2", autocompletion.getString("rawequal"), "Returns boolean - result of __eq metamethod", new CustomParameter[][]{
            {new CustomParameter("object", "v1", false, "First object to compare"), new CustomParameter("object", "v2", true, "Second object to compare")}
        });

        createCompletion(defaultProvider, "rawget", "Lua 5.2", autocompletion.getString("rawget"), "Returns value at <code>index</code> of <code>table</code>", new CustomParameter[][]{
            {new CustomParameter("table", "table", false, "Table to get value from"), new CustomParameter("number", "index", true, "Index of the <code>table</code> to get value of")}
        });

        createCompletion(defaultProvider, "rawlen", "Lua 5.2", autocompletion.getString("rawlen"), "Returns the length of the object", new CustomParameter[][]{
            {new CustomParameter("table", "v", true, "Object to measure length of")}
        });
        //OpenOS API
        //Shortcuts
        /* TODO */
        //
        LanguageAwareCompletionProvider p = new LanguageAwareCompletionProvider(defaultProvider);
        return p;
    }

    /**
     * Creates a new FunctionCompletion with params
     *
     * @param p DefaultCompletionProvider to add to
     * @param name Function name
     * @param returnType Function return value's type
     * @param definedIn API version where function is first defined
     * @param shortDesc Function description
     * @param returnDesc Function return value's description
     * @param pars Function parameters' 2d-array
     */
    private static void createCompletion(DefaultCompletionProvider p, String name, String definedIn, String shortDesc, String returnDesc, CustomParameter[][] pars) {
        //Every possible parameter's variant
        for (CustomParameter[] par : pars) {
            FunctionCompletion f = new FunctionCompletion(p, name, "function");
            f.setDefinedIn(definedIn);
            f.setShortDescription(shortDesc);
            f.setReturnValueDescription(returnDesc);
            f.setParams(Arrays.asList(par));
            p.addCompletion(f);
        }
    }
}

class CustomParameter extends Parameter {

    /**
     *
     * @param type Parameter's type
     * @param name Parameter's name
     * @param endParam If the pararmeter is final
     * @param desc Parameter's description
     */
    public CustomParameter(String type, String name, boolean endParam, String desc) {
        super(type, name, endParam);
        setDescription(desc);
    }

}
