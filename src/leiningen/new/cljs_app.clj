(ns leiningen.new.cljs-app
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cljs-app"))

(defn cljs-app [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
             ["resources/index.html" (render "index.html" data)])))
