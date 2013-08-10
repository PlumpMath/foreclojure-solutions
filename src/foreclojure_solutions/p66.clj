(ns foreclojure-solutions.p66
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Greatest Common Divisor"
  (__ 2 4) => 2
  (__ 10 5) => 5
  (__ 5 7) => 1
  (__ 1023 858) => 33)
