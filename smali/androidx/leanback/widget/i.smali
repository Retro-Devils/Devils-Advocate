.class Landroidx/leanback/widget/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/leanback/widget/i$a;
    }
.end annotation


# instance fields
.field private a:I

.field public final b:Landroidx/leanback/widget/i$a;

.field public final c:Landroidx/leanback/widget/i$a;

.field private d:Landroidx/leanback/widget/i$a;

.field private e:Landroidx/leanback/widget/i$a;


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/i;->a:I

    new-instance v1, Landroidx/leanback/widget/i$a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroidx/leanback/widget/i$a;-><init>(I)V

    iput-object v1, p0, Landroidx/leanback/widget/i;->b:Landroidx/leanback/widget/i$a;

    new-instance v2, Landroidx/leanback/widget/i$a;

    invoke-direct {v2, v0}, Landroidx/leanback/widget/i$a;-><init>(I)V

    iput-object v2, p0, Landroidx/leanback/widget/i;->c:Landroidx/leanback/widget/i$a;

    iput-object v2, p0, Landroidx/leanback/widget/i;->d:Landroidx/leanback/widget/i$a;

    iput-object v1, p0, Landroidx/leanback/widget/i;->e:Landroidx/leanback/widget/i$a;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/leanback/widget/i$a;
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/i;->d:Landroidx/leanback/widget/i$a;

    return-object v0
.end method

.method public final b(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/i;->a:I

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/leanback/widget/i;->c:Landroidx/leanback/widget/i$a;

    iput-object p1, p0, Landroidx/leanback/widget/i;->d:Landroidx/leanback/widget/i$a;

    iget-object p1, p0, Landroidx/leanback/widget/i;->b:Landroidx/leanback/widget/i$a;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/leanback/widget/i;->b:Landroidx/leanback/widget/i$a;

    iput-object p1, p0, Landroidx/leanback/widget/i;->d:Landroidx/leanback/widget/i$a;

    iget-object p1, p0, Landroidx/leanback/widget/i;->c:Landroidx/leanback/widget/i$a;

    :goto_0
    iput-object p1, p0, Landroidx/leanback/widget/i;->e:Landroidx/leanback/widget/i$a;

    return-void
.end method
