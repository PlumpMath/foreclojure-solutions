(ns foreclojure-solutions.p20
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Penultimate Element"
  (__ (list 1 2 3 4 5)) => 4
  (__ ["a" "b" "c"]) => "b"
  (__ [[1 2] [3 4]]) => [1 2])
