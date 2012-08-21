(defproject cljmx "1.0.0-SNAPSHOT"
  :description "JMX tool"
  :dependencies [ 
    [org.clojure/clojure    "1.4.0" ] 
    [org.clojure/java.jmx   "0.1"   ]
    [org.clojure/tools.cli  "0.2.2" ]
  ]
  :disable-implicit-clean true
  :main cljmx.core)
