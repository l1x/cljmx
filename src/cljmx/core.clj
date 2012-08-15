(ns cljmx.core
(:require
   [clojure.java.jmx :as jmx],
   [clojure.pprint :as pprint])
(:gen-class))

(defn -main [& args]
  ;(println "Welcome to my project! These are your args:" args))
  ;(println (seq (.getURLs (java.lang.ClassLoader/getSystemClassLoader))))
  ;(doseq [i (jmx/mbean-names "*:*")] (prn i))
  ;(doseq [j (jmx/mbean "java.lang:type=Memory")] (prn j))
  ;{:Verbose false, :ObjectPendingFinalizationCount 0, 
    ;:HeapMemoryUsage {:committed 85000192, :init 0, :max 129957888, :used 17811912}, 
    ;:NonHeapMemoryUsage {:committed 24317952, :init 24317952, :max 136314880, :used 16712040}} 
  ;(println (jmx/mbean "java.lang:type=Memory"))

  (println (get (get (jmx/mbean "java.lang:type=Memory") :HeapMemoryUsage) :committed))

)
