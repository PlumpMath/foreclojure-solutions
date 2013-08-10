(ns foreclojure-solutions.p157
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Indexing Sequences"
  (__ [:a :b :c]) => [[:a 0] [:b 1] [:c 2]]
  (__ [0 1 3]) '((0 0) (1 1) => (3 2))
  (__ [[:foo] {:bar :baz}]) => [[[:foo] 0] [{:bar :baz} 1]])
