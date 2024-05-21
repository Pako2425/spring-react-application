import './App.css';

function App() {
  async function getMessage() {
    const response = await fetch("http://localhost:5000/home/example-url");
    const data = await response.json();
    return data;
    
  }

  const handleClick = async () => {
    const a = await getMessage();
    console.log(a.message);
  }
  
  return (
    <>
      <button onClick={handleClick}>Click me</button>
      
    </>
    
  );
}

export default App;
