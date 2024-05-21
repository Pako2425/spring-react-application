import './App.css';

function App() {
  async function getMessage() {
    const response = await fetch("http://localhost:5000/home/example-url");
    const message = response.json();
    return message;
  }
  
  return (
    <>
      <button onClick={() => console.log(getMessage())}>Click me</button>
      
    </>
    
  );
}

export default App;
