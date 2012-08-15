(ns cljmx.core
(:require
   [clojure.java.jmx :as jmx],
   [clojure.pprint :as pprint])
(:gen-class))

(defn -main [& args]

  ;{:Verbose false, :ObjectPendingFinalizationCount 0, 
    ;:HeapMemoryUsage {:committed 85000192, :init 0, :max 129957888, :used 17811912}, 
    ;:NonHeapMemoryUsage {:committed 24317952, :init 24317952, :max 136314880, :used 16712040}} 


  (println (get-in (jmx/mbean "java.lang:type=Memory") [:HeapMemoryUsage :committed]))

  (println (:b (:a {:a {:b 42}})))
  (get-in {:a {:b 42}} [:a :b])

  (def memory (jmx/mbean "java.lang:type=Memory"))
  (get-in memory [:HeapMemoryUsage :committed])


)
