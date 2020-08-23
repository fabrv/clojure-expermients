(ns experiments.core)

;; Measure if 4 points are a rectangle
(defn vector-magnitude [v]
  (js/Math.sqrt
    (+ (js/Math.pow (nth v 0) 2) (js/Math.pow (nth v 1) 2))
  )
)

(defn vector-angle [u, v]
  (js/Math.acos (
    /
    (+ (* (nth u 0) (nth v 0)) (* (nth u 1) (nth v 1)))
    (
      *
      (vector-magnitude u)
      (vector-magnitude v)
    )
  ))
)

(defn is-square [angle]
  (= (/ angle js/Math.PI) 0.5)
)

(defn vector [p0, p1]
  (list
    (- (nth p1 0) (nth p0 0))
    (- (nth p1 1) (nth p0 1))
  )
)

(defn is-rectangle [p0, p1, p2, p3]
  (and
    (is-square (vector-angle (vector p0 p1) (vector p0 p2)))
    (is-square (vector-angle (vector p3 p1) (vector p3 p2)))
  )
)

(println (is-rectangle (list 7 3) (list 10 2) (list 7 0) (list 10 0)))