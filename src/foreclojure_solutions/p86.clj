(ns foreclojure-solutions.p86
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Happy numbers"
  (__ 7) => true
  (__ 986543210) => true
  (__ 2) => false
  (__ 3) => false)
