.class Lcom/gtomato/android/ui/manager/CarouselLayoutManager$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E1(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;


# direct methods
.method constructor <init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;I)V
    .locals 0

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$d;->c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    iput p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$d;->c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$d;->b:I

    invoke-virtual {v0, v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E1(I)V

    return-void
.end method
