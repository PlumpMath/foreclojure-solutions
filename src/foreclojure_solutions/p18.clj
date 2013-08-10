(ns foreclojure-solutions.p18
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Sequences: filter"
  __ => (filter #(> % 5) '(3 4 5 6 7)))
