package cn.alex.pattern.singleton;

import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.sql.DriverManager;
import java.util.logging.Logger;

/**
 * JDK源码中的单例模式
 * @author Alex
 */
public class Test {
    public static void main(String[] args) {
      //单例模式
        //1. Runtime


        // 2.System


       //3. Logger

        /*
private static final LoggerBundle SYSTEM_BUNDLE = new LoggerBundle(SYSTEM_LOGGER_RB_NAME, null);

// This instance indicates that no resource bundle has been specified yet,
// and it will be shared by all loggers which have no resource bundle.
private static final LoggerBundle NO_RESOURCE_BUNDLE = new LoggerBundle(null, null);
         */


//       4. DriverManager



        //5.URLClassLoader
        /*

    public static URLClassLoader newInstance(final URL[] urls,
                                     final ClassLoader parent) {
        // Save the caller's context
        final AccessControlContext acc = AccessController.getContext();
        // Need a privileged block to create the class loader
        URLClassLoader ucl = AccessController.doPrivileged(
            new PrivilegedAction<URLClassLoader>() {
                public URLClassLoader run() {
                    return new FactoryURLClassLoader(urls, parent, acc);
                }
            });
        return ucl;
}


        public static URLClassLoader newInstance(final URL[] urls) {
            // Save the caller's context
            final AccessControlContext acc = AccessController.getContext();
            // Need a privileged block to create the class loader
            URLClassLoader ucl = AccessController.doPrivileged(
                    new PrivilegedAction<URLClassLoader>() {
                        public URLClassLoader run() {
                            return new FactoryURLClassLoader(urls, acc);
                        }
                    });
            return ucl;
        }

         */
    }
}
