(ns {{name}}.core
  (:require [weasel.repl :as repl]))

(enable-console-print!)

(defn init []
  (when-not (repl/alive?)
    (repl/connect "ws://localhost:9001")))

(set! (.-onload js/window) init)
