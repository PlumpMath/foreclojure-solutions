(ns foreclojure-solutions.p80
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Perfect Numbers"
  (__ 6) => true
  (__ 7) => false
  (__ 496) => true
  (__ 500) => false
  (__ 8128) => true)
