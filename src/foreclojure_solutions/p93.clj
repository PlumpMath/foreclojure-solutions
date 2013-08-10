(ns foreclojure-solutions.p93
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Partially Flatten a Sequence"
  (__ [["Do"] ["Nothing"]]) => [["Do"] ["Nothing"]]
  (__ [[[[:a :b]]] [[:c :d]] [:e :f]]) => [[:a :b] [:c :d] [:e :f]]
  (__ '((1 2)((3 4)((((5 6))))))) => '((1 2)(3 4)(5 6)))
