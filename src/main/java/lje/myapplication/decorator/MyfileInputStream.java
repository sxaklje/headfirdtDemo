package lje.myapplication.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.FilterReader;
import java.io.InputStream;
import java.io.LineNumberReader;

/**
 * Created by lijiane on 17/2/23.
 */

public class MyfileInputStream extends FilterInputStream{

    protected MyfileInputStream (InputStream inputStream){
        super(inputStream);
    }
    FileReader  reader;
    BufferedReader v;
    LineNumberReader t;
    FilterReader c;

}
