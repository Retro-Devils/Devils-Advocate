.class Lcom/digdroid/alman/dig/n2$e$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/n2$e$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/n2$e$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/n2$e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2$e$a$a;->b:Lcom/digdroid/alman/dig/n2$e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$e$a$a;->b:Lcom/digdroid/alman/dig/n2$e$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/n2$e$a;->b:Lcom/digdroid/alman/dig/n2$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/n2$e;->a:Lcom/digdroid/alman/dig/n2;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/n2;->h:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/n2;->g(Lcom/digdroid/alman/dig/n2;I)V

    :cond_0
    return-void
.end method
