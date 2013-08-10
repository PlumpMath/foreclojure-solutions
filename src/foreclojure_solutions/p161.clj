(ns foreclojure-solutions.p161
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Subset and Superset"
  (clojure.set/superset? __ #{2}) => true
  (clojure.set/subset? #{1} __) => true
  (clojure.set/superset? __ #{1 2}) => true
  (clojure.set/subset? #{1 2} __) => true)
