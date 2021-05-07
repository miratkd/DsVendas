import BarChart from "components/barChart";
import DataTable from "components/dataTable";
import DonutChart from "components/donutChart";
import Footer from "components/footer";
import NavBar from "components/navBar";

function DashBoard () {
    return (
        <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">DashBord de Vendas</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Porcentagem de sucesso (%)</h5>
            <BarChart/>
          </div>
          <div className="col-sm-6">
            <h5>Todas vendas</h5>
            <DonutChart/>
          </div>
        </div>
        <h1 className="text-primary py-3">Todas vendas</h1>
        <DataTable />
      </div>
      <Footer />
    </>
    )
}

export default DashBoard;