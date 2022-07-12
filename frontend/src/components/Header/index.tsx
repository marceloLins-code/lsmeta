import logo from '../../assets/img/logo.svg'
import './styles.css'
function Header() {
  return (
    <header>
    <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>
        Developed By
          <a href="https://www.instagram.com/devsuperior.ig">@devsuperior.ig</a>
        </p>
    </div>
</header>
  )
}

export default Header
// 1:09 min