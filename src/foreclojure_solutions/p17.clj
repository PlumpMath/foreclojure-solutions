(ns foreclojure-solutions.p17
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Sequences: map"
  __ => (map #(+ % 5) '(1 2 3)))
