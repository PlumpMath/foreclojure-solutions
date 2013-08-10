(ns foreclojure-solutions.p105
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Identify keys and values"
  {} => (__ [])
  {:a [1]} => (__ [:a 1])
  {:a [1], :b [2]} => (__ [:a 1, :b 2])
  {:a [1 2 3], :b [], :c [4]} => (__ [:a 1 2 3 :b :c 4]))
