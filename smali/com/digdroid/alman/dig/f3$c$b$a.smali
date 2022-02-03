.class Lcom/digdroid/alman/dig/f3$c$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3$c$b;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/f3$c$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3$c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$c$b$a;->a:Lcom/digdroid/alman/dig/f3$c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lcom/digdroid/alman/dig/f3$c$b$a$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/f3$c$b$a$a;-><init>(Lcom/digdroid/alman/dig/f3$c$b$a;)V

    const/4 v1, 0x1

    new-array v1, v1, [[Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
