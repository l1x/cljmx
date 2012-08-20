(ns cljmx.core
  (:require [clojure.java.jmx   :as jmx], 
            [clojure.tools.cli  :as cli]
  (:gen-class)))

(defn invoke [{:keys [host port bean]}]
  (println (str "Invoking on bean " bean " at " host ":" port))
  (defn alltehbeans [path]
    (map (memfn getCanonicalName) (jmx/mbean-names path)))
  (defn gimmethat [x]
    (doseq [s x] (println (jmx/mbean s)) ))
  (jmx/with-connection {:host host, :port port}
    (gimmethat (alltehbeans bean))))

(defn run-with [[options args banner]]
  (when (:help options)
    (println banner)
    (System/exit 1))
  (invoke options))

(defn -main [& args]  
  (run-with (cli/cli args    
    ["-h" "--host" "Host to connect to" :default "localhost"]
    ["-p" "--port" "Port to connect to" :parse-fn #(Integer. %)]
    ["-b" "--bean" "Bean name"]
    ["--help" "Show help" :default false :flag true])))


