(ns foreclojure-solutions.p73
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Analyze a Tic-Tac-Toe Board"
  nil => (__ [[:e :e :e]
            [:e :e :e]
            [:e :e :e]])
  :x => (__ [[:x :e :o]
           [:x :e :e]
           [:x :e :o]])
  :o => (__ [[:e :x :e]
           [:o :o :o]
           [:x :e :x]])
  nil => (__ [[:x :e :o]
            [:x :x :e]
            [:o :x :o]])
  :x => (__ [[:x :e :e]
           [:o :x :e]
           [:o :e :x]])
  :o => (__ [[:x :e :o]
           [:x :o :e]
           [:o :e :x]])
  nil => (__ [[:x :o :x]
            [:x :o :x]
            [:o :x :o]]))
