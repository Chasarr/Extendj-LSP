package org.extendj.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.net.URL;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.Set;
import beaver.Symbol;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.zip.*;
import java.io.*;
import org.jastadd.util.*;
import java.util.LinkedHashSet;
import org.jastadd.util.PrettyPrintable;
import org.jastadd.util.PrettyPrinter;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
/**
 * @ast class
 * @aspect BytecodeCONSTANT
 * @declaredat /Users/Jonte/Documents/Appar/2021-compiler-lsp/server_java/extendj/java4/frontend/BytecodeCONSTANT.jrag:246
 */
 class CONSTANT_NameAndType_Info extends CONSTANT_Info {
  
    public int name_index;

  
    public int descriptor_index;

  

    public CONSTANT_NameAndType_Info(AbstractClassfileParser parser) throws IOException {
      super(parser);
      name_index = p.u2();
      descriptor_index = p.u2();
    }

  

    @Override
    public String toString() {
      return "NameAndTypeInfo: " + name_index + " " + descriptor_index;
    }


}
