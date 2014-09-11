/**
 * 
 */
package org.polarsys.kitalpha.releng;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.tools.ant.Task;

/**
 * @author Matthieu Helleboid
 *
 */
public abstract class AbstractTask extends Task {

    protected void readFile(File file, List<String> list) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            String line = null;
            while((line = reader.readLine()) != null) {
                if (!list.contains(line))
                    list.add(line);
            }
        } finally {
            if (reader != null)
                reader.close();
        }
    }

    protected void writeFile(File file, List<String> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        try {
            for (String line : list)
                writer.write(line + "\n");
        } finally {
            if (writer != null)
                writer.close();
        }
    }
}
