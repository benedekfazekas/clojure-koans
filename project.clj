(defproject clojure-koans "0.5.0-SNAPSHOT"
  :description "The Clojure koans."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [koan-engine "0.2.0"]
                 [org.clojure/algo.monads "0.1.4"]]
  :dev-dependencies [[lein-koan "0.1.2"]]
  :profiles {:dev {:dependencies [[lein-koan "0.1.2"]]}}
  :repl-options {:init-ns user}
  :plugins [[lein-koan "0.1.2"]]
  :main koan-engine.runner/exec)
