(ns cljmx.core
(:require
   [clojure.java.jmx :as jmx])
(:gen-class))

(defn -main [& args]
  (println "Welcome to my project! These are your args:" args))
  (println (seq (.getURLs (java.lang.ClassLoader/getSystemClassLoader))))

(jmx/mbean-names \"*:*\")