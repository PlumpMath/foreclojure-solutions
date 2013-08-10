(ns foreclojure-solutions.p38
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Maximum value"
  (__ 1 8 3 4) => 8
  (__ 30 20) => 30
  (__ 45 67 11) => 67)
