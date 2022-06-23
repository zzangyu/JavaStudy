window.onload = function () {
  new Chart(document.getElementById("radar-chart3"), {
      type: 'radar',
      data: {
        labels: ["Africa", "Asia", "Europe", "Latin America", "North America", "GamJa"],
        datasets: [
          {
            label: "감자칩", 
            fill: true,
            backgroundColor: "rgba(255,99,132,0.2)",
            borderColor: "rgba(255,99,132,1)",
            pointBorderColor: "#fff",
            pointBackgroundColor: "rgba(255,99,132,1)",
            pointBorderColor: "#fff",
            data: [1,2,3,4,3,2]
          }
        ]
      },
      options: {
      responsive: false,
        title: {
          display: true,
          
          text: 'JAVA'
        }
      }
  });
  new Chart(document.getElementById("radar-chart2"), {
      type: 'radar',
      data: {
        labels: ["Africa", "Asia", "Europe", "Latin America", "North America", "GamJa"],
        datasets: [
          {
            label: "감자링", 
            fill: true,
            backgroundColor: "rgba(255,99,132,0.2)",
            borderColor: "rgba(255,99,132,1)",
            pointBorderColor: "#fff",
            pointBackgroundColor: "rgba(255,99,132,1)",
            pointBorderColor: "#fff",
            data: [1,2,3,4,3,2]
          }
        ]
      },
      options: {
      responsive: false,
        title: {
          display: true,
          
          text: 'JAVA'
        }
      }
  });
  new Chart(document.getElementById("radar-chart1"), {
      type: 'radar',
      data: {
        labels: ["Africa", "Asia", "Europe", "Latin America", "North America", "GamJa"],
        datasets: [
          {
            label: "튀김", 
            fill: true,
            backgroundColor: "rgba(255,99,132,0.2)",
            borderColor: "rgba(255,99,132,1)",
            pointBorderColor: "#fff",
            pointBackgroundColor: "rgba(255,99,132,1)",
            pointBorderColor: "#fff",
            data: [1,2,3,4,3,2]
          }
        ]
      },
      options: {
      responsive: false,
        title: {
          display: true,
          
          text: 'JAVA'
        }
      }
  });
}
