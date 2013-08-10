(ns foreclojure-solutions.p119
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Win at Tic-Tac-Toe"
  (__ :x [[:o :e :e] 
             [:o :x :o] 
             [:x :x :e]]) => #{[2 2] [0 1] [0 2]}
  (__ :x [[:x :o :o] 
             [:x :x :e] 
             [:e :o :e]]) => #{[2 2] [1 2] [2 0]}
  (__ :x [[:x :e :x] 
             [:o :x :o] 
             [:e :o :e]]) => #{[2 2] [0 1] [2 0]}
  (__ :x [[:x :x :o] 
             [:e :e :e] 
             [:e :e :e]]) => #{}
  (__ :o [[:x :x :o] 
             [:o :e :o] 
             [:x :e :e]]) => #{[2 2] [1 1]})
