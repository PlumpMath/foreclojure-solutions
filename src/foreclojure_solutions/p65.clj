(ns foreclojure-solutions.p65
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Black Box Testing"
  :map => (__ {:a 1, :b 2})
  :list => (__ (range (rand-int 20)))
  :vector => (__ [1 2 3 4 5 6])
  :set => (__ #{10 (rand-int 5)})
  [:map :set :vector :list] (map __ [{} #{} [] => ()]))
