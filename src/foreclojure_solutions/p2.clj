(ns foreclojure-solutions.p2
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Simple Math"
  (- 10 (* 2 3)) => __)
