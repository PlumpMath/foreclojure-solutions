(ns foreclojure-solutions.p53
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Longest Increasing Sub-Seq"
  (__ [1 0 1 2 3 0 4 5]) => [0 1 2 3]
  (__ [5 6 1 3 2 7]) => [5 6]
  (__ [2 3 3 4 5]) => [3 4 5]
  (__ [7 6 5 4]) => [])
