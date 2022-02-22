import './App.css';
import Header from './components/Header';
import Section from './components/Section';
import Info from './components/Info';
import Testimonials from './components/Testimonials';
import {ScrollSection, ScrollContainer} from 'react-onepage-scroll';

function App() {
  return (
    <div className="App">
      <ScrollContainer>
             <ScrollSection pageId={0}><Header/><Section/></ScrollSection>
             <ScrollSection pageId={1}><Info/></ScrollSection>
             <ScrollSection pageId={2}><Testimonials/></ScrollSection>        
      </ScrollContainer>  
    </div>
  );
}

export default App;