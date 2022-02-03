.class Landroidx/leanback/widget/a0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/leanback/widget/a0$a;
    }
.end annotation


# instance fields
.field private a:I

.field public final b:Landroidx/leanback/widget/a0$a;

.field public final c:Landroidx/leanback/widget/a0$a;

.field private d:Landroidx/leanback/widget/a0$a;

.field private e:Landroidx/leanback/widget/a0$a;


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/a0;->a:I

    new-instance v0, Landroidx/leanback/widget/a0$a;

    const-string v1, "vertical"

    invoke-direct {v0, v1}, Landroidx/leanback/widget/a0$a;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Landroidx/leanback/widget/a0;->b:Landroidx/leanback/widget/a0$a;

    new-instance v1, Landroidx/leanback/widget/a0$a;

    const-string v2, "horizontal"

    invoke-direct {v1, v2}, Landroidx/leanback/widget/a0$a;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    iput-object v1, p0, Landroidx/leanback/widget/a0;->d:Landroidx/leanback/widget/a0$a;

    iput-object v0, p0, Landroidx/leanback/widget/a0;->e:Landroidx/leanback/widget/a0$a;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/leanback/widget/a0$a;
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/a0;->d:Landroidx/leanback/widget/a0$a;

    return-object v0
.end method

.method public final b()V
    .locals 1

    invoke-virtual {p0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->s()V

    return-void
.end method

.method public final c()Landroidx/leanback/widget/a0$a;
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/a0;->e:Landroidx/leanback/widget/a0$a;

    return-object v0
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/a0;->a:I

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    iput-object p1, p0, Landroidx/leanback/widget/a0;->d:Landroidx/leanback/widget/a0$a;

    iget-object p1, p0, Landroidx/leanback/widget/a0;->b:Landroidx/leanback/widget/a0$a;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/leanback/widget/a0;->b:Landroidx/leanback/widget/a0$a;

    iput-object p1, p0, Landroidx/leanback/widget/a0;->d:Landroidx/leanback/widget/a0$a;

    iget-object p1, p0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    :goto_0
    iput-object p1, p0, Landroidx/leanback/widget/a0;->e:Landroidx/leanback/widget/a0$a;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "horizontal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; vertical="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/leanback/widget/a0;->b:Landroidx/leanback/widget/a0$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
