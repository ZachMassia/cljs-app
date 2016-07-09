(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.89"]
                 [com.cemerick/piggieback "0.2.1"]
                 [weasel "0.7.0"]]

  :plugins [[lein-cljsbuild "1.1.3"]
            [lein-simpleton "1.3.0"]]

  :source-paths ["src"]

  ;; Weasel setup --------------------------------------------------------------
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :injections [(require '[cemerick.piggieback :refer [cljs-repl]]
                        '[weasel.repl.websocket :refer [repl-env]])
               (defn browser-repl []
                 (cljs-repl (repl-env :ip "0.0.0.0" :port 9001)))]
  ;; ===========================================================================

  :aliases {"server" ["trampoline" "simpleton" "8080" "file" ":from" "resources"]}

  :cljsbuild {
    :builds [{:id "{{name}}"
              :source-paths ["src"]
              :compiler {
                :output-to "resources/js/{{sanitized}}.js"
                :output-dir "resources/js/out"
                :optimizations :none
                :source-map true}}]})
