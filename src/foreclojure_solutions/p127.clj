(ns foreclojure-solutions.p127
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Love Triangle"
  10 => (__ [15 15 15 15 15])
  15 => (__ [1 3 7 15 31])
  3 => (__ [3 3])
  4 => (__ [7 3])
  6 => (__ [17 22 6 14 22])
  9 => (__ [18 7 14 14 6 3])
  nil => (__ [21 10 21 10])
  nil => (__ [0 31 0 31 0]))
