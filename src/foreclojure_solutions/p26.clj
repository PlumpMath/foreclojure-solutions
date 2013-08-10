(ns foreclojure-solutions.p26
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Fibonacci Sequence"
  (__ 3) => '(1 1 2)
  (__ 6) => '(1 1 2 3 5 8)
  (__ 8) => '(1 1 2 3 5 8 13 21))
