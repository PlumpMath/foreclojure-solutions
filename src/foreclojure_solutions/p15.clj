(ns foreclojure-solutions.p15
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Double Down"
  (__ 2) => 4
  (__ 3) => 6
  (__ 11) => 22
  (__ 7) => 14)
