(ns foreclojure-solutions.p134
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "A nil key"
  (true?  (__ :a {:a nil :b 2})) => true
  (false? (__ :b {:a nil :b 2})) => true
  (false? (__ :c {:a nil :b 2})) => true)
