
import './App.css'
import Caseitem from './components/caseitem'
import Caselist from './components/caselist'
import Header from './components/header'

function App() {
    const [fetchedModels, setFetchedModels] = useState([]);
    useEffect(() => {
      const getModels = async () =>{
        const models = await axios.get(
          "http://"
        )
      }
      return () => {
        cleanup
      }
    }, [input])
  

  return (
    <div className="App">
      <Header />
      <div className="itemplacement">
      <div className="caselistplacement">
      <Caselist />
      </div>
      <div className="caseitemplacement">
      <Caseitem />
      </div>
      </div>
    </div>
  )
}

export default App
