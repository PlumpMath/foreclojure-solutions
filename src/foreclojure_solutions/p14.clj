(ns foreclojure-solutions.p14
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Functions"
  __ => ((fn add-five [x] (+ x 5)) 3)
  __ => ((fn [x] (+ x 5)) 3)
  __ => (#(+ % 5) 3)
  __ => ((partial + 5) 3))
