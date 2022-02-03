.class Landroidx/leanback/widget/SearchBar$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/leanback/widget/SearchBar;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/leanback/widget/SearchBar;


# direct methods
.method constructor <init>(Landroidx/leanback/widget/SearchBar;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/SearchBar$i;->b:Landroidx/leanback/widget/SearchBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-object v0, p0, Landroidx/leanback/widget/SearchBar$i;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v0, v0, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocusFromTouch()Z

    iget-object v0, p0, Landroidx/leanback/widget/SearchBar$i;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v0, v0, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-object v5, p0, Landroidx/leanback/widget/SearchBar$i;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v5, v5, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getWidth()I

    move-result v5

    int-to-float v6, v5

    iget-object v5, p0, Landroidx/leanback/widget/SearchBar$i;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v5, v5, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getHeight()I

    move-result v5

    int-to-float v7, v5

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v0, p0, Landroidx/leanback/widget/SearchBar$i;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v0, v0, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-object v5, p0, Landroidx/leanback/widget/SearchBar$i;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v5, v5, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getWidth()I

    move-result v5

    int-to-float v6, v5

    iget-object v5, p0, Landroidx/leanback/widget/SearchBar$i;->b:Landroidx/leanback/widget/SearchBar;

    iget-object v5, v5, Landroidx/leanback/widget/SearchBar;->d:Landroidx/leanback/widget/SearchEditText;

    invoke-virtual {v5}, Landroid/widget/EditText;->getHeight()I

    move-result v5

    int-to-float v7, v5

    const/4 v5, 0x1

    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    return-void
.end method
