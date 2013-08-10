(ns foreclojure-solutions.p12
  (:use midje.sweet))

(defn __ []
  4)

(future-fact "Intro to Sequences"
  __ => (first '(3 2 1))
  __ => (second [2 3 4])
  __ => (last (list 1 2 3)))
