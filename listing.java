/*
 * The MIT License
 *
 * Copyright 2015 Bhavesh.
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

/**
 *
 * @author Bhavesh
 */
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.PrintWriter;
 import java.io.UnsupportedEncodingException;
 import java.util.Date;

public class listing {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException  {
        File currentDir = new File("."); // current directory
        displayDirectoryContents(currentDir);
    }

    public static void displayDirectoryContents(File dir) throws FileNotFoundException, UnsupportedEncodingException  {
			PrintWriter out = new PrintWriter("abc.md", "UTF-8");
//        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
//                    System.out.println("directory:"+ file.getCanonicalPath());
                    //file.
                    // out.println("directory:"+file.getName() +file.getAbsolutePath());
										out.println("##"+file.getName());
										out.println("|File|Size|Modified Date|");
										out.println("| :------------- | :------------- |:------------- |");


                    displayDirectoryContents(file);
                } else {
									Date lastMod = new Date(file.lastModified());

                    out.println("|"+file.getName()+"|"+file.length()/1024+"KB|"+lastMod+"|");

//                    System.out.println("file:"+ file.getCanonicalPath());
                }
            }

//        catch (IOException e) {
//            e.printStackTrace();
//  PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
      // }
			out.close();

		}
}
//}
