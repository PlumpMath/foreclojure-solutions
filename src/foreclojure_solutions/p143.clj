(ns foreclojure-solutions.p143
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "dot product"
  0 => (__ [0 1 0] [1 0 0])
  3 => (__ [1 1 1] [1 1 1])
  32 => (__ [1 2 3] [4 5 6])
  256 => (__ [2 5 6] [100 10 1]))
