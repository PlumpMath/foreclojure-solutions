(ns foreclojure-solutions.p57
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Simple Recursion"
  __ => ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))
