import logo from './logo.svg';
import './App.css';
import { Header } from './Header';
import {NavBar} from './NavBar';
import { Footer } from './Footer';

function App() {
      const emailLink ={"mail":'ram@abc.com',"text":'Administration'}
  return (
    <div className="App">
      <Header heading={"Kubera Taxi Service"}></Header>
      <Footer footer={"Designed by ABCINFOTECH LIMITED"} email={emailLink}></Footer>
      
      
    </div>
  );
}

export default App;
